.class public final synthetic LHo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LAo0;

.field public final synthetic c:Lco/bird/android/model/persistence/Bird;


# direct methods
.method public synthetic constructor <init>(LAo0;Lco/bird/android/model/persistence/Bird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHo0;->b:LAo0;

    iput-object p2, p0, LHo0;->c:Lco/bird/android/model/persistence/Bird;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LHo0;->b:LAo0;

    iget-object v1, p0, LHo0;->c:Lco/bird/android/model/persistence/Bird;

    invoke-static {v0, v1}, LAo0$a$d;->f(LAo0;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
