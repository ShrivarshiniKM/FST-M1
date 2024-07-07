import pytest


@pytest.fixture()
def wallet():
    amount = 0
    return amount


@pytest.mark.parametrize("earned, spent, expected", [(1000, 200, 800), (2000, 1000, 1000), (2500, 500, 2000),(2500, 500, 2000)])
def test_parameter(wallet, earned, spent, expected):
    # Add money to your wallet
    wallet += earned

    # Subtract amount from wallet
    wallet -= spent

    # Assertion
    assert wallet == expected

# @pytest.mark.parametrize("num, output", [(1, 11), (2, 22), (3, 33)])
# def test_multiplication_11(num, output):
#     assert 11 * num == output