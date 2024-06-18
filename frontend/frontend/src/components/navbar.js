import React from 'react';

function Navbar() {

    return (
        <nav className="nav">
            <a href="#" className="brand">Books</a>
            <ul className="nav__menu">
                <li className="nav__item"><a href="#" className="nav__link">Home</a></li>
                <li className="nav__item"><a href="#" className="nav__link">About</a></li>
                <li className="nav__item"><a href="#" className="nav__link">Books</a></li>
                <li className="nav__item"><a href="#" className="nav__link">Register</a></li>
                <li className="nav__item"><a href="#" className="nav__link">Login</a></li>
                <li className="nav__item"><a href="#" className="nav__link">Logout</a></li>
            </ul>
            <div className="nav__toggler">
                <div className="line1"></div>
                <div className="line2"></div>
                <div className="line3"></div>
            </div>
        </nav>
    );
}

export default Navbar;