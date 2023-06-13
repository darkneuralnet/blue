.class public final synthetic LCc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/CameraxView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/CameraxView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCc0;->b:Lco/bird/android/widget/CameraxView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LCc0;->b:Lco/bird/android/widget/CameraxView;

    invoke-static {v0}, Lco/bird/android/widget/CameraxView;->c(Lco/bird/android/widget/CameraxView;)V

    return-void
.end method
