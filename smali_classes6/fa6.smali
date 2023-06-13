.class public final synthetic Lfa6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lga6;

.field public final synthetic c:LdQ3;


# direct methods
.method public synthetic constructor <init>(Lga6;LdQ3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa6;->b:Lga6;

    iput-object p2, p0, Lfa6;->c:LdQ3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lfa6;->b:Lga6;

    iget-object v1, p0, Lfa6;->c:LdQ3;

    invoke-static {v0, v1}, Lga6;->c(Lga6;LdQ3;)V

    return-void
.end method
