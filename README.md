# 🐍 Snake Game — Java

> A classic Snake Game built from scratch in Java using Swing for GUI rendering and keyboard-based controls.

---

## 📌 Overview

A fully functional implementation of the classic Snake Game using core Java. The game features real-time movement, food spawning, collision detection, and score tracking — all rendered through Java's Swing library without any external dependencies.

---

## 🎮 Gameplay

- Control the snake using **Arrow Keys**
- Eat food to grow longer and increase your score
- Game ends on **wall collision** or **self-collision**
- Score resets on restart

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| **Java** | Core game logic |
| **Java Swing** | GUI rendering & game window |
| **AWT** | Graphics, KeyListener, Timer |
| **IntelliJ IDEA** | Development environment |

---

## 📁 Project Structure

```
Snake-Game/
│
├── src/                    # All source (.java) files
│   ├── GamePanel.java      # Core game loop, rendering, collision logic
│   ├── GameFrame.java      # JFrame window setup
│   └── ...
│
├── Snake game.iml          # IntelliJ module file
├── .gitignore              # Excludes compiled output and IDE artifacts
└── README.md
```

> ⚠️ **Note:** The `out/` and `bin/` folders (compiled `.class` files) are excluded via `.gitignore` and not pushed to this repository. You need to **build the project locally** before running it — instructions below.

---

## ⚙️ Setup & Run Instructions

### Prerequisites
- Java JDK 8 or above installed → [Download here](https://www.oracle.com/java/technologies/downloads/)
- IntelliJ IDEA (recommended) → [Download here](https://www.jetbrains.com/idea/)

### Steps

**Option 1 — IntelliJ IDEA (Recommended)**
1. Clone the repository
   ```bash
   git clone https://github.com/Shalvigour/Snake-Game.git
   ```
2. Open IntelliJ IDEA → `File` → `Open` → select the cloned folder
3. IntelliJ will auto-detect the project structure
4. Click the **Run ▶️** button or press `Shift + F10`

**Option 2 — Command Line**
1. Clone the repository
   ```bash
   git clone https://github.com/Shalvigour/Snake-Game.git
   cd Snake-Game
   ```
2. Compile the source files
   ```bash
   javac -d out src/*.java
   ```
3. Run the game
   ```bash
   java -cp out GameFrame
   ```

---

## 🚫 What's Not Included in This Repo

The following are intentionally excluded and listed in `.gitignore`:

| Excluded Item | Reason |
|--------------|--------|
| `out/` | Compiled `.class` bytecode — generated locally on build |
| `bin/` | Binary output files — IDE/compiler generated |
| `.vscode/` | Editor-specific settings, not project code |
| `.DS_Store` | macOS system file, irrelevant to the project |

> The `.idea/` folder (IntelliJ project settings) is currently present in the repo. It is recommended to add it to `.gitignore` to keep the repository clean for collaborators using different IDEs.

---

## 🎯 Key Concepts Demonstrated

- Object-Oriented Programming in Java
- Game loop using `javax.swing.Timer`
- Real-time keyboard input handling via `KeyListener`
- 2D rendering using `Graphics` and `paintComponent()`
- Collision detection logic

---

## 👩‍💻 Author

**Shalvi Gaur** — [GitHub](https://github.com/Shalvigour)
