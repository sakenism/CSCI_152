#include <stdlib.h>
#include <stdio.h>

typedef struct _doubleNode {
	char value;
	struct _doubleNode* link;
} doubleNode;

void printList(doubleNode *node) {

	if (node != NULL) {
		printf("%c ", node->value);
		printList(node->link);
	}
}


void printListBack(doubleNode *node) {

	if (node != NULL) {
		printListBack(node->link);
		printf("%c ", node->value);
	}
}


void freeAll(doubleNode *node) {

	if (node != NULL) {
		freeAll(node->link);
		printf("Freeing up %f \n", node->value);
		free(node);
	}
}
void fill(doubleNode *node)
{
	doubleNode *tmp = malloc(sizeof(doubleNode));
	node->link = tmp;
	tmp->link = NULL;
	tmp->value = (char)((int)(node->value) + 1);
	if(tmp->value == 'z')
		return;
	fill(tmp);
}

int main(void) {

	setvbuf(stdout, NULL, _IONBF, 0);

	doubleNode *first = NULL;
	doubleNode *prev = NULL;
	doubleNode *newNode = malloc(sizeof(doubleNode));
	newNode->value = 'a';
	fill(newNode);
	printListBack(newNode);

/*
	do {
		printf("Enter in a double:");
		double x;
		scanf("%lf", &x);

		if (x < 0.0) {
			break;
		}

		doubleNode *newNode = malloc(sizeof(doubleNode));

		newNode->value = x;
		newNode->link = NULL;

		if (first == NULL) {
			first = newNode;
		} else {
			prev->link = newNode;
		}

		prev = newNode;

	} while (1);
*/
	printList(first);

	printf("Done.");

	freeAll(first);

	return 0;
}
