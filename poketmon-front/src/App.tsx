import React from 'react';
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { MAIN_PATH, RESULT_PATH, SAVE_PATH } from './constants';
import Main from './main';
import Save from './save';
import Result from './result';

function App() {
  return (
    <Router>
    <Routes>
      <Route path={MAIN_PATH} element={<Main/>}/>
      <Route path={SAVE_PATH} element={<Save/>}/>
      <Route path={RESULT_PATH} element={<Result/>}/>
    </Routes>
    </Router>
  );
}

export default App;
