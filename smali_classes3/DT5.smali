.class public final synthetic LDT5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/suggestanest/SuggestNestActivity;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDT5;->b:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, LDT5;->b:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    invoke-static {v0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->P(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V

    return-void
.end method
