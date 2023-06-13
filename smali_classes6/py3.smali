.class public final synthetic Lpy3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgZ0$a;


# instance fields
.field public final synthetic a:LgZ0$a;

.field public final synthetic b:LgZ0$a;


# direct methods
.method public synthetic constructor <init>(LgZ0$a;LgZ0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpy3;->a:LgZ0$a;

    iput-object p2, p0, Lpy3;->b:LgZ0$a;

    return-void
.end method


# virtual methods
.method public final a(LX94;)V
    .locals 2

    iget-object v0, p0, Lpy3;->a:LgZ0$a;

    iget-object v1, p0, Lpy3;->b:LgZ0$a;

    invoke-static {v0, v1, p1}, Lqy3;->d(LgZ0$a;LgZ0$a;LX94;)V

    return-void
.end method
