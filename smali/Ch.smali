.class public final synthetic LCh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/App;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/App;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCh;->b:Lco/bird/android/App;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LCh;->b:Lco/bird/android/App;

    invoke-static {v0}, Lco/bird/android/App;->d(Lco/bird/android/App;)V

    return-void
.end method
