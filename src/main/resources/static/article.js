//만약 디렉터리를 생성하면서 파일을 한번에 만들고 싶다면 static 디렉터리에서 파일 생성 할때 파일 이름을 js/article.js로 생성 하면 됌

// 삭제 기능
const deleteButton = document.getElementById('delete-btn');

if (deleteButton) {
    deleteButton.addEventListener('click', event => {
        let id = document.getElementById('article-id').value;
        fetch(`/api/articles/${id}`, {
            method: 'DELETE'
        })
            .then(() => {
                alert('삭제가 완료되었습니다.');
                location.replace('/articles');
            });
    });
}