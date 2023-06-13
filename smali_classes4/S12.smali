.class public final synthetic LS12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/InfoPillLinearLayout;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/InfoPillLinearLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS12;->b:Lco/bird/android/widget/InfoPillLinearLayout;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LS12;->b:Lco/bird/android/widget/InfoPillLinearLayout;

    invoke-static {v0}, Lco/bird/android/widget/InfoPillLinearLayout;->a(Lco/bird/android/widget/InfoPillLinearLayout;)V

    return-void
.end method
