import pytest


# @pytest.fixture
# def input_list_value():
#     input_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
#     return input_list


@pytest.mark.mytest
def test_sum_of_the_elements(input_list_value):
    total = 0
    for i in input_list_value:
        total += i
    print("total : ", total)
    assert total == 55

