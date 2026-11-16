<div align="center">

# 🤖 Robot Applet

**A Java AWT robot drawing that runs as a desktop app or a classic applet, plus a web page with a talking robot guide.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

[Features](#features) · [Tech Stack](#tech-stack) · [Getting Started](#getting-started) · [Project Structure](#project-structure)

</div>

---

## Overview

This is a small Java project that uses the Applet API. `RobotApplet` extends `java.applet.Applet` and draws a robot (head, eyes, mouth, body, arms and legs) on a 400×400 canvas with `java.awt.Graphics`. An HTML page embeds the applet and adds a JavaScript "robot guide" that shows a message and speaks it aloud with the Web Speech API.

## Features

- **Java applet** (`RobotApplet.java`)
  - Sets a 400×400 white canvas in `init()`
  - Draws the robot in `paint()` with filled rectangles, ovals and lines in several colours
  - Has a `main` method that shows the applet in an AWT window, so it runs as a normal desktop app with `java RobotApplet`
- **Interactive web page** (`RobotApplet.html`)
  - Embeds the compiled applet with an `<object>` tag
  - **About Me**, **Projects** and **Contact** buttons update the robot's dialogue text
  - Each message is read aloud with the browser's `SpeechSynthesis` (text-to-speech) API
- **Styling** (`styles.css`): centred layout and green navigation buttons with hover effects

## Tech Stack

| Area | Technology |
| ---- | ---------- |
| Applet / desktop app | Java (`java.applet.Applet`, AWT `Frame`, `Graphics`, `Color`) |
| Page | HTML5, CSS3 |
| Interactivity | JavaScript, Web Speech API (`SpeechSynthesisUtterance`) |

## Getting Started

### Prerequisites

- A JDK (8 or later) that still includes `java.applet`. The Applet API is deprecated for removal; this project was tested with JDK 24.
- A modern web browser for the HTML page

### Run as a desktop app (recommended)

```bash
git clone https://github.com/Swayam7024/java_aplet.git
cd java_aplet
javac RobotApplet.java
java RobotApplet
```

A 400×400 window opens and draws the robot. Close the window to exit.

The committed `RobotApplet.class` files were compiled with `javac --release 8`, so they also run on Java 8 without recompiling. You may see a deprecation warning when compiling on a newer JDK; it is safe to ignore.

### Run as an applet (optional, JDK 8)

Browsers no longer run Java applets. To see it as an applet, use `appletviewer` from JDK 8:

```bash
appletviewer RobotApplet.html
```

If `appletviewer` does not pick up the `<object>` tag, create a minimal HTML file containing `<applet code="RobotApplet.class" width="400" height="400"></applet>` and run `appletviewer` on that file.

### Open the web page

Open `RobotApplet.html` in a browser to try the navigation buttons and the text-to-speech dialogue. (The embedded applet itself does not render in modern browsers.)

## Project Structure

```
java_aplet/
├── RobotApplet.java    # Applet source: draws the robot; main() runs it in a window
├── RobotApplet.class   # Compiled applet (Java 8 bytecode)
├── RobotApplet$1.class # Compiled window-close handler used by main()
├── RobotApplet.html    # Portfolio page that embeds the applet; JS robot dialogue
└── styles.css          # Page styles
```

## Future Improvements

- Port the drawing to a Swing `JPanel` or an HTML5 `<canvas>`, since the Applet API is being removed from future JDKs
- Animate the robot (waving arms, blinking eyes) and sync it with the spoken dialogue
- Fill the About, Projects and Contact sections with real content

## Author

**Swayam Khantwal**: [github.com/Swayam7024](https://github.com/Swayam7024)

## License

This project is licensed under the [MIT License](LICENSE).
