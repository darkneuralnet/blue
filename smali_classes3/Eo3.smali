.class public final synthetic LEo3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LDo3$e;


# direct methods
.method public synthetic constructor <init>(LDo3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEo3;->b:LDo3$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LEo3;->b:LDo3$e;

    invoke-static {v0}, LDo3$e;->a(LDo3$e;)V

    return-void
.end method
