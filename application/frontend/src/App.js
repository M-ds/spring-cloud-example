import './assets/App.css';
import React from "react";
import Overview from "./overview/Overview";

class App extends React.Component {
  render() {
    return (
      <div className="App">
        <Overview/>
      </div>
    );
  }
}

export default App;
