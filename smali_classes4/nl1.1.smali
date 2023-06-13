.class public final synthetic Lnl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lol1;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lol1;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnl1;->b:Lol1;

    iput p2, p0, Lnl1;->c:I

    iput-object p3, p0, Lnl1;->d:Ljava/lang/String;

    iput-object p4, p0, Lnl1;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnl1;->b:Lol1;

    iget v1, p0, Lnl1;->c:I

    iget-object v2, p0, Lnl1;->d:Ljava/lang/String;

    iget-object v3, p0, Lnl1;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lol1;->E(Lol1;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
