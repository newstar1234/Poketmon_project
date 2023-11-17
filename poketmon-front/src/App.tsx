import React from 'react';
import './App.css';
import { Routes, Route } from 'react-router-dom';
import { MAIN_PATH } from './constants';

function App() {
  return (
    <Routes>
      <Route path={MAIN_PATH}/>
    </Routes>
  );
}

export default App;
