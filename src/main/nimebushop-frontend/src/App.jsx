import {useEffect, useState} from 'react'
import './App.css'

function AddProduct() {
    const [productId, setProductId] = useState("");
    const [productName, setProductName] = useState("");

    async function handleSubmit(e) {
        e.preventDefault();
        await fetch("/api/products", {
            method: "post",
            body: JSON.stringify({productId, productName}),
            headers: {
                "Content-Type": "application/json"
            }
        });

    }

    return <div>
        <form onSubmit={handleSubmit}>
            <div><label>Product id: <input type={"number"} value={productId} onChange={event => setProductId(event.target.value)}/></label></div>
            <div><label>Product name: <input type={"text"} value={productName} onChange={event => setProductName(event.target.value)}/></label></div>
            <button>submit</button>
        </form>
    </div>
}

function ListProducts() {
    const [loading, setLoading] = useState(true);
    const [products, setProducts] = useState([]);

    useEffect(() => {
        (async () => {
            const res = await fetch("api/products");
            setProducts(await res.json());
            setLoading(false);
        })();
    }, [])

  if (loading){
      return <div>Loading products ...</div>
  }
  return <ul>{products.map(p => <div>produkt id {p.productId} : {p.productName}</div>)}</ul>
}

function App() {

  return (
    <div className="App">
        <h1>Welcome to Nimebu Shop!</h1>
        <AddProduct/>
        <ListProducts/>
    </div>
  )
}

export default App
