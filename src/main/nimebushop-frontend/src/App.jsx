import {useEffect, useState} from 'react'
import reactLogo from './assets/react.svg'
import './App.css'

function AddProduct() {
  return null;
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
