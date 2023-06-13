.class public final synthetic LR56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LU56;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(LU56;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR56;->a:LU56;

    iput-boolean p2, p0, LR56;->b:Z

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LR56;->a:LU56;

    iget-boolean v1, p0, LR56;->b:Z

    invoke-static {v0, v1, p1}, LU56;->c(LU56;ZLO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
