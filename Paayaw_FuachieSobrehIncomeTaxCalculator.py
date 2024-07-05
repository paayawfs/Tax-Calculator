
def income_tax_calculator(n):
    first_bracket = 402.0                     # Initializing all the brackets
    second_bracket = 110.0
    third_bracket = 130.0
    fourth_bracket = 3000.0
    fifth_bracket = 16395.0
    sixth_bracket = 29963.0
    tax = 0

    if n <= first_bracket:                          # Checking for non-taxable income
        return n

    taxable_amount = n - first_bracket

    if taxable_amount >= second_bracket:                       # Checks if the taxable amount is greater than a bracket
        tax = tax + 5.5                                        # If the taxable income is more it updates the tax
        taxable_amount = taxable_amount - second_bracket       # If it's less calculates the percentage and updates tax

    elif taxable_amount < second_bracket:
        tax = tax + (0.05*taxable_amount)
        return n - tax

    if taxable_amount >= third_bracket:
        tax = tax + 13
        taxable_amount = taxable_amount - third_bracket

    elif taxable_amount < third_bracket:
        tax = tax + (0.1 * taxable_amount)
        return n - tax

    if taxable_amount >= fourth_bracket:
        tax = tax + 525
        taxable_amount = taxable_amount - fourth_bracket

    elif taxable_amount < fourth_bracket:
        tax = tax + (0.175 * taxable_amount)
        return n - tax

    if taxable_amount >= fifth_bracket:
        tax = tax + 4098.75
        taxable_amount = taxable_amount - fifth_bracket

    elif taxable_amount < fifth_bracket:
        tax = tax + (0.25 * taxable_amount)
        return n - tax

    if taxable_amount >= sixth_bracket:
        tax = tax + 8988.90
        taxable_amount = taxable_amount - sixth_bracket

    elif taxable_amount < sixth_bracket:
        tax = tax + (0.3 * taxable_amount)
        return n - tax

    if taxable_amount > 0:
        tax = tax + (0.35 * taxable_amount)

    net_income = n - tax

    return net_income


gross_income = int(input("Enter your gross income. The program will print out your net income. "))

print(income_tax_calculator(gross_income))
