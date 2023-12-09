# Клас Lab7KononKI305 реалізує завдання до лабораторної роботи №7, варіант 13.
class Lab7KononKI305:
    # Статичний метод main є точкою входу в програму
    @staticmethod
    def main():
        # розмір матриці, матриця та символ-заповнювач
        n_size = 0
        arr = []
        filler = ""

        # Введення розміру матриці (парне число > 4)
        while True:
            try:
                n_size = int(input("\nВведіть розмір квадратної матриці (парне число > 4): "))
                if n_size % 2 != 0 or n_size < 4:
                    print("\nВВЕДІТЬ ПАРНЕ ЧИСЛО > 4!")
                else:
                    break
            except ValueError:
                print("\nБудь ласка, введіть коректне число.")

        # Створення матриці та введення символа-заповнювача
        arr = [[''] * (n_size // 2) for _ in range(n_size)]
        filler = input("\nВведіть символ-заповнювач: ")

        # Перевірка коректності введення символа-заповнювача
        if len(filler) == 1:
            # Вирівнювання матриці при виводі, заповнення її символом-заповнювачем та збереження в файл
            with open("Lab7.txt", "w") as fout:
                for i in range(n_size):
                    for j in range(n_size // 2):
                        arr[i][j] = filler
                        print(f" {arr[i][j]}", end="")
                        fout.write(f" {arr[i][j]}")
                    print()
                    fout.write("\n")
        elif not filler:
            print("\nНе введено символ заповнювач")
        else:
            print("\nЗабагато символів заповнювачів!")


# Виклик статичного методу main класу Lab7KononKI305
Lab7KononKI305.main()
