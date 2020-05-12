import React,{ Component } from 'react';
import './App.css';
import Movie from './Movie';

class App extends Component {

  state = {
  } 

  componentDidMount(){
    fetch('https://yts.mx/api/v2/list_movies.json?sort_by=rating')
    .then(response => response.json())
    .then(json => console.log(json))
    .catch(err => console.log(err))
  
  }

  _renderMovies = () => {
    const movies = this.state.movies.map((movies, index) => {
      return <Movie title={movies.title} poster={movies.poster} key={index} />
    })
    return movies
  }

  render() {
    return (
    <div className="App">
      {this.state.movies ? this._renderMovies() : 'Loding'}
    </div>
    );
  }
}

export default App;



