import pytest

@pytest.fixture
def input_value():
   input = 39
   return input


@pytest.fixture
def input_list_value():
    input_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return input_list