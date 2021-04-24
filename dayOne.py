#Love Calculator
print('Calculate love meter!')
myName = input('What is your name?').lower()
hisOrHerName = input('What is his/her name?').lower()

combined = myName + hisOrHerName

t = combined.count('t')
r = combined.count('r')
u = combined.count('u')
e = combined.count('e')

true = t + r + u + e

l = combined.count('l')
o = combined.count('o')
v = combined.count('v')
e = combined.count('e')

love = l + o + v + e

love_score = int(str(true) + str(love))

if love_score>90 or love_score<10:
    print(f'Your score is {love_score}, you are like mentos and he/she be like your coke!')
elif love_score>50:
    print(f'You will do just fine, score is {love_score}')
else:
    print(f'Your score is {love_score}')
