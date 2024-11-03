# 🏝 Uninhabited Island Simulation

This is a Java application that simulates an uninhabited island ecosystem with various animals that can move and interact with each other. The application focuses on practicing **multithreading**, simulating interactions between carnivores, herbivores, and plants in a grid-based environment.

## 🐾 Key Features

- **Animal Types**:
  - **Carnivores**: Predatory animals that hunt and consume other animals.
  - **Herbivores**: Plant-eating animals that graze on vegetation.
  - **Plants**: Serve as a food source for herbivores and grow in various cells.

- **Island Grid**:
  - The island is divided into cells where animals and plants exist.
  - Animals can move between cells, search for food, and interact with other entities.
  - Carnivores may hunt herbivores, while herbivores graze on plants.

- **Multithreading**:
  - Each animal and plant operates on a separate thread, creating a dynamic, real-time simulation.
  - Threads synchronize to handle interactions such as movement, eating, and reproduction, ensuring accurate and efficient concurrency.
  
## 🛠 Tech Stack

- **Java Core**: The core language used for object-oriented modeling and simulation logic.
- **Multithreading**: Utilizes Java's multithreading capabilities to manage concurrent animal actions.
- **Concurrency Utilities**: Uses Java’s `synchronized`, `ReentrantLock`, and `ExecutorService` for managing thread safety and performance.
