def naive_match(text, pat):
    n, m = len(text), len(pat)
    for i in range(n - m + 1):
        if text[i:i+m] == pat:
            print("Pattern found at index", i)

text = "ABABDABACDABABCABAB"
pat = "ABABCABAB"
naive_match(text, pat)
