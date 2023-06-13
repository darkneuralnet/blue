.class public final LPg0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPg0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:LPF;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/net/URL;LPF;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPg0$a;->a:Ljava/net/URL;

    iput-object p2, p0, LPg0$a;->b:LPF;

    iput-object p3, p0, LPg0$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/net/URL;)LPg0$a;
    .locals 3

    new-instance v0, LPg0$a;

    iget-object v1, p0, LPg0$a;->b:LPF;

    iget-object v2, p0, LPg0$a;->c:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, LPg0$a;-><init>(Ljava/net/URL;LPF;Ljava/lang/String;)V

    return-object v0
.end method
