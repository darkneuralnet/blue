.class public final synthetic LLh6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/User;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/User;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLh6;->b:Lco/bird/android/model/User;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LLh6;->b:Lco/bird/android/model/User;

    invoke-static {v0}, LJh6$j;->a(Lco/bird/android/model/User;)Lco/bird/android/model/User;

    move-result-object v0

    return-object v0
.end method
