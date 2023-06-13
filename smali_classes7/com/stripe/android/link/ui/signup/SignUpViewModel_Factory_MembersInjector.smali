.class public final Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;",
        ">;"
    }
.end annotation


# instance fields
.field private final signUpViewModelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;->signUpViewModelProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;-><init>(LY94;)V

    return-object v0
.end method

.method public static injectSignUpViewModel(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;->signUpViewModel:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;->signUpViewModelProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;->injectSignUpViewModel(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;->injectMembers(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)V

    return-void
.end method
