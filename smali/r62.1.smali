.class public final synthetic Lr62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ls62;

.field public final synthetic c:LO80$a;

.field public final synthetic d:LHX1$a;


# direct methods
.method public synthetic constructor <init>(Ls62;LO80$a;LHX1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr62;->b:Ls62;

    iput-object p2, p0, Lr62;->c:LO80$a;

    iput-object p3, p0, Lr62;->d:LHX1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lr62;->b:Ls62;

    iget-object v1, p0, Lr62;->c:LO80$a;

    iget-object v2, p0, Lr62;->d:LHX1$a;

    invoke-static {v0, v1, v2}, Ls62;->a(Ls62;LO80$a;LHX1$a;)V

    return-void
.end method
