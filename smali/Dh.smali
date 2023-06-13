.class public final synthetic LDh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/lifecycle/f;

.field public final synthetic c:Lco/bird/android/App;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/f;Lco/bird/android/App;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh;->b:Landroidx/lifecycle/f;

    iput-object p2, p0, LDh;->c:Lco/bird/android/App;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LDh;->b:Landroidx/lifecycle/f;

    iget-object v1, p0, LDh;->c:Lco/bird/android/App;

    invoke-static {v0, v1}, Lco/bird/android/App$c;->b(Landroidx/lifecycle/f;Lco/bird/android/App;)V

    return-void
.end method
