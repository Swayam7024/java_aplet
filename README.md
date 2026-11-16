# Robot Applet

A Java applet that draws a simple robot with AWT graphics, embedded in an "interactive portfolio" web page with a talking robot guide.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

## Overview

This is a small Java project that uses the Applet API. `RobotApplet` extends `java.applet.Applet` and draws a robot (head, eyes, mouth, body, arms and legs) on a 400×400 canvas with `java.awt.Graphics`. An HTML page embeds the applet and adds a JavaScript "robot guide" that shows a message and speaks it aloud with the Web Speech API.

## Features

- **Java applet** (`RobotApplet.java`)
  - Sets a 400×400 white canvas in `init()`
  - Draws the robot in `paint()` with filled rectangles, ovals and lines in several colours
- **Interactive web page** (`RobotApplet.html`)
  - Embeds the compiled applet with an `<object>` tag
  - **About Me**, **Projects** and **Contact** buttons update the robot's dialogue text
  - Each message is read aloud with the browser's `SpeechSynthesis` (text-to-speech) API
- **Styling** (`styles.css`): centred layout and green navigation buttons with hover effects

## Tech Stack

| Area | Technology |
| ---- | ---------- |
| Applet | Java (`java.applet.Applet`, AWT `Graphics`, `Color`) |
| Page | HTML5, CSS3 |
| Interactivity | JavaScript, Web Speech API (`SpeechSynthesisUtterance`) |

## Getting Started

> **Note:** Java applets are no longer supported by modern browsers, and the Applet API has been deprecated since Java 9 and removed from recent JDKs. The HTML page's buttons and text-to-speech work in any browser, but the applet itself does not render there. Use `appletviewer` from JDK 8 to view the applet.

### Prerequisites

- A JDK that still includes `java.applet` (JDK 8 is recommended, because it also ships `appletviewer`)
- A modern web browser for the HTML page

### Compile

```bash
git clone https://github.com/Swayam7024/java_aplet.git
cd java_aplet
javac RobotApplet.java
```

The repository already contains a compiled `RobotApplet.class`, built with JDK 24 (class file version 68). Recompile it if you use an older JDK.

### Run the applet

Use `appletviewer` (JDK 8). It reads the applet tag from an HTML file:

```bash
appletviewer RobotApplet.html
```

If `appletviewer` does not pick up the `<object>` tag, create a minimal HTML file containing `<applet code="RobotApplet.class" width="400" height="400"></applet>` and run `appletviewer` on that file.

### Open the web page

Open `RobotApplet.html` in a browser to try the navigation buttons and the text-to-speech dialogue.

## Project Structure

```
java_aplet/
├── RobotApplet.java    # Applet source: draws the robot
├── RobotApplet.class   # Compiled applet
├── RobotApplet.html    # Portfolio page that embeds the applet; JS robot dialogue
└── styles.css          # Page styles
```

## Future Improvements

- Port the drawing to a Swing `JPanel` or an HTML5 `<canvas>` so it runs on current JDKs and browsers
- Animate the robot (waving arms, blinking eyes) and sync it with the spoken dialogue
- Fill the About, Projects and Contact sections with real content

## Author

**Swayam Khantwal**: [github.com/Swayam7024](https://github.com/Swayam7024)

## License

This project is licensed under the [MIT License](LICENSE).
