import React from 'react';
import './App.css';
import Navbar from './components/navbar';
import { Routes,Route } from "react-router-dom";
import { BrowserRouter } from "react-router-dom";
import About from './components/about';
import Register from './components/register';
import Login from './components/login';
import Books from './components/books';

function App() {
  return (
    <div>

        <p>Home Page Here, must login/register</p>
            <div>


            <div className="App">
             <BrowserRouter>
             <Navbar/>
                  <Routes>
                      <Route path='/about' element= { <About/>} />
                      <Route path='/register' element= { <Register/>} />
                      <Route path='/' element={<Login />} />
                      <Route path='/login' element={<Login />} />
                      <Route path='/books' element={<Books />} />
                 </Routes>
             </BrowserRouter>
            </div>
            </div>
    </div>
  );
}

export default App;
