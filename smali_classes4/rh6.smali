.class public final synthetic Lrh6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LJh6;


# direct methods
.method public synthetic constructor <init>(LJh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrh6;->b:LJh6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrh6;->b:LJh6;

    invoke-static {v0}, LJh6;->C(LJh6;)Lco/bird/android/model/User;

    move-result-object v0

    return-object v0
.end method
