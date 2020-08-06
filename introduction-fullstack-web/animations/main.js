$(document).ready(() => {
    $('#active_toggle').click(() => {
        $('#toggle').slideToggle()
        $('#active_toggle').text('Reactive')
    })

    $('#active_animate').click(() => {
        $('#animate').animate({height: '2px'}, 500)
        $('#active_animate').prop( "disabled", true )
    })
})

document.getElementById('active_square').addEventListener('click', () => {
    document.getElementById('square').style.animation = 'turnSquare 2s infinite'
    document.getElementById('active_square').disabled = true
})

document.getElementById('active_ball').addEventListener('click', () => {
    document.getElementById('ball').style.animation = 'jumpBall 10s infinite'
    document.getElementById('active_ball').disabled = true
})