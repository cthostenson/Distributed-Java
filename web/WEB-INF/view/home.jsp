<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Film Finder</title>
    <link rel="stylesheet" href="<spring:url value='/resources/css/style.css'/>">
    <link href="https://fonts.googleapis.com/css?family=Patrick+Hand|Righteous|Roboto&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/846547d137.js"></script>
</head>
<body>
<div class="wrapper">
    <div class="inside-wrapper">
        <header>
            <div class="item"><a href="index.html"><h1>Film Finder</h1></a></div>
            <div class="item"><i class="fas fa-search"></i><i class="fas fa-search"></i><i class="fas fa-search"></i></div>
        </header>
    </div>
    <div class="content">
        <div class="nav-outside">
            <nav>
                <a href="#"><div class="item-link">About</div></a>
                <a href="#"><div class="item-link">News</div></a>
                <a href="movies.html"><div class="item-link">Movies</div></a>
                <a href="#"><div class="item-link">Actors</div></a>
                <a href="#"><div class="item-link">Purchase</div></a>
                <a href="showSearchPage"><div class="item-link">Search</div></a>
            </nav>
        </div>
        <main>
            <article>
                <div class="item-main"><h2>New</h2></div>
                <a href="#">
                    <div class="item-main-img" id="main1">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>The Lion King</h3>
                                <p>Watch the remake of the classic kids movie, "The Lion King".</p>
                            </div>
                        </div>
                    </div>
                </a>
                <a href="#">
                    <div class="item-main-img" id="main2">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>Once Upon A Time In... Hollywood</h3>
                                <p>Watch Quentin Tarantino's 10th movie.</p>
                            </div>
                        </div>
                    </div>
                </a>
                <a href="#">
                    <div class="item-main-img" id="main3">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>47 Meters Down: Uncaged</h3>
                                <p>Watch the scariest shark movie of the decade.</p>
                            </div>
                        </div>
                    </div>
                </a>
            </article>

            <article>
                <div class="item-main"><h2>Popular</h2></div>
                <a href="#">
                    <div class="item-main-img" id="main4">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>Avengers Endgame</h3>
                                <p>Watch the epic finale of Marvel's first cinematic universe.</p>
                            </div>
                        </div>
                    </div>
                </a>
                <a href="#">
                    <div class="item-main-img" id="main5">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>John Wick 3</h3>
                                <p>Watch adrenaline fueled action with Keanu Reaves.</p>
                            </div>
                        </div>
                    </div>
                </a>
                <a href="#">
                    <div class="item-main-img" id="main6">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>Get Out</h3>
                                <p>Watch Jordan Peele's original thriller production.</p>
                            </div>
                        </div>
                    </div>
                </a>
            </article>

            <article>
                <div class="item-main"><h2>Our Picks</h2></div>
                <a href="#">
                    <div class="item-main-img" id="main7">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>Fantastic Mr. Fox</h3>
                                <p>Watch Wes Anderson's stop motion adaptation of Roald Dahl's book.</p>
                            </div>
                        </div>
                    </div>
                </a>
                <a href="specific-movie.html">
                    <div class="item-main-img" id="main8">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>The Naked Gun</h3>
                                <p>Watch Leslie Neilsen's comedy masterpiece.</p>
                            </div>
                        </div>
                    </div>
                </a>
                <a href="#">
                    <div class="item-main-img" id="main9">
                        <div class="layer">
                            <svg xmlns="http://www.w3.org/2000/svg">
                                <rect class="shape" />
                            </svg>
                            <div class="text">
                                <h3>The Dark Knight</h3>
                                <p>Watch the second installment in Christopher Nolan's Batman trilogy.</p>
                            </div>
                        </div>
                    </div>
                </a>

            </article>

        </main>
    </div>
    <div class="inside-wrapper">
        <footer>
            <div class="item"><p>filmfinder@gmail.com<br>262-123-1234</div>
            <div class="item">&copy; Film Finder</div>
        </footer>
    </div>
</div>
</body>
</html>
