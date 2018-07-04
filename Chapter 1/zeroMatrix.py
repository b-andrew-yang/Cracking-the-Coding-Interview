def main():
    test_matrix = [[0, 1, 2, 3], [2, 3, 4, 5],
                   [3, 4, 5, 0], [1, 1, 1, 1]]
    print(test_matrix)
    print(zeroMatrix(test_matrix))


def zeroMatrix(matrix):
    zero_indices = []
    counter = 0

    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if(matrix[i][j] == 0):
                zero_indices.append([i, j])
                counter += 1

    for k in zero_indices:
        for l in range(len(matrix)):
            matrix[k[0]][l] = 0
        for m in range(len(matrix[0])):
            matrix[m][k[1]] = 0
    return matrix


if __name__ == '__main__':
    main()
