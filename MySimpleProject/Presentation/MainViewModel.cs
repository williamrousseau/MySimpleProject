using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using System.Windows.Input;

namespace MySimpleProject.Presentation
{
    public partial class MainViewModel : ObservableObject
    {
        public string? Title { get; }

        [ObservableProperty]
        private string? name;

        public ICommand GoToSecond { get; }

        public MainViewModel(INavigator navigator)
        {
            _navigator = navigator;
            Title = "Main - MyExtensionsApp";
            GoToSecond = new AsyncRelayCommand(GoToSecondView);
        }

        private async Task GoToSecondView()
        {
            await _navigator.NavigateViewModelAsync<SecondViewModel>(this, data: new Entity(Name!));
        }

        private INavigator _navigator;
    }
}