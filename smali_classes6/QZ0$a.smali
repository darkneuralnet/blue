.class public LQZ0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQZ0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQZ0;-><init>(LQZ0$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LQZ0$b<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LQZ0;


# direct methods
.method public constructor <init>(LQZ0;)V
    .locals 0

    iput-object p1, p0, LQZ0$a;->a:LQZ0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LQZ0$a;->a:LQZ0;

    invoke-static {v0, p1}, LQZ0;->u(LQZ0;Ljava/lang/Throwable;)Z

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iget-object v0, p0, LQZ0$a;->a:LQZ0;

    invoke-static {v0, p1}, LQZ0;->t(LQZ0;Ljava/lang/Object;)Z

    return-void
.end method
