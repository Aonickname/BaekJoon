def grade_to_point(grade):
    if grade == 'A+':
        return 4.5
    elif grade == 'A0':
        return 4.0
    elif grade == 'B+':
        return 3.5
    elif grade == 'B0':
        return 3.0
    elif grade == 'C+':
        return 2.5
    elif grade == 'C0':
        return 2.0
    elif grade == 'D+':
        return 1.5
    elif grade == 'D0':
        return 1.0
    elif grade == 'F':
        return 0.0

total_points = 0.0
total_credits = 0.0

for _ in range(20):
    course, credit, grade = input().split()
    credit = float(credit)
    if grade == 'P':
        continue
    total_points += credit * grade_to_point(grade)
    total_credits += credit

if total_credits == 0:
    gpa = 0.0
else:
    gpa = total_points / total_credits

print(f"{gpa:.6f}")