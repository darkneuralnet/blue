.class public final synthetic Lb84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ll84;


# direct methods
.method public synthetic constructor <init>(Ll84;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb84;->b:Ll84;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb84;->b:Ll84;

    invoke-static {v0}, Ll84;->a0(Ll84;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
