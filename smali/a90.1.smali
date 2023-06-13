.class public final synthetic La90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc90;

.field public final synthetic c:LO80$a;


# direct methods
.method public synthetic constructor <init>(Lc90;LO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La90;->b:Lc90;

    iput-object p2, p0, La90;->c:LO80$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La90;->b:Lc90;

    iget-object v1, p0, La90;->c:LO80$a;

    invoke-static {v0, v1}, Lc90;->b(Lc90;LO80$a;)V

    return-void
.end method
