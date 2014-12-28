# not ac
def compare(dic, input):
    for word in dic:
        if word == input:
            print input + " is correct"
            return
    ipl = len(input)
    result = []
    for word in dic:
        wl = len(word)
        if ipl == wl:
            if (equal(word, input, wl)) == 1:
                result.append(word)
        if ipl - wl == 1:
            if (longer(word, input)) == 1:
                result.append(word)
        if ipl - wl == -1:
            if (shorter(word, input)) == 1:
                result.append(word)
    print input + ' : ',
    for r in result:
        print r,
    print

def equal(word, input, c):
    wi = 0
    for i in range(c):
        if word[i] != input[i]:
            wi += 1
            i += 1
            if wi > 1:
                return 0
    return 1

def longer(word, input):
    wi = 0
    i = 0
    for c in input:
        if c != word[i]:
            wi += 1
            if wi > 1:
                return 0
        else:
            i += 1
    if wi == 1 and i == 0:
        return 0
    return 1

def shorter(word, input):
    wi = 0
    i = 0
    for c in input:
        if c != word[i]:
            wi += 1
            if wi > 1:
                return 0
        else:
            i += 1
    return 1



if __name__ == '__main__':
    dic = []
    while (True):
        input = raw_input()
        if input == '#':
            break
        dic.append(input)
    print
    while (True):
        input = raw_input()
        if input == '#':
            break
        compare(dic, input)

