.class public final synthetic LJu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LCv0;


# direct methods
.method public synthetic constructor <init>(LCv0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJu0;->b:LCv0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJu0;->b:LCv0;

    invoke-virtual {v0}, LCv0;->d()Lcom/google/firebase/remoteconfig/internal/b;

    move-result-object v0

    return-object v0
.end method
