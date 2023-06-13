.class public final LdM0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwH2$b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:LwH2$c;

.field public b:LlG2;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LcM0;)V
    .locals 0

    invoke-direct {p0}, LdM0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LlG2;)LwH2$b$a;
    .locals 0

    invoke-virtual {p0, p1}, LdM0$a;->c(LlG2;)LdM0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(LwH2$c;)LwH2$b$a;
    .locals 0

    invoke-virtual {p0, p1}, LdM0$a;->d(LwH2$c;)LdM0$a;

    move-result-object p1

    return-object p1
.end method

.method public build()LwH2$b;
    .locals 4

    iget-object v0, p0, LdM0$a;->a:LwH2$c;

    const-class v1, LwH2$c;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, LdM0$a;->b:LlG2;

    const-class v1, LlG2;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LdM0$b;

    iget-object v1, p0, LdM0$a;->a:LwH2$c;

    iget-object v2, p0, LdM0$a;->b:LlG2;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LdM0$b;-><init>(LwH2$c;LlG2;LeM0;)V

    return-object v0
.end method

.method public c(LlG2;)LdM0$a;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LlG2;

    iput-object p1, p0, LdM0$a;->b:LlG2;

    return-object p0
.end method

.method public d(LwH2$c;)LdM0$a;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LwH2$c;

    iput-object p1, p0, LdM0$a;->a:LwH2$c;

    return-object p0
.end method
