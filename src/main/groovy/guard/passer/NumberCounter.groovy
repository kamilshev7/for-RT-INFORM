package guard.passer

def list = [1, 3, 4, 5, 1, 5, 4]
def answer = [:]

list.each { element ->
    answer[element] = answer.containsKey(element) ? answer[element] + 1 : 1
}

println answer

