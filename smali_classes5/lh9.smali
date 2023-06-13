.class public final Llh9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Date;

.field public final b:LVg9;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Date;ILVg9;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh9;->a:Ljava/util/Date;

    iput-object p3, p0, Llh9;->b:LVg9;

    iput-object p4, p0, Llh9;->c:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/util/Date;)Llh9;
    .locals 3

    new-instance v0, Llh9;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2, v2}, Llh9;-><init>(Ljava/util/Date;ILVg9;Ljava/lang/String;)V

    return-object v0
.end method

.method public static c(LVg9;Ljava/lang/String;)Llh9;
    .locals 3

    new-instance v0, Llh9;

    invoke-virtual {p0}, LVg9;->c()Ljava/util/Date;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Llh9;-><init>(Ljava/util/Date;ILVg9;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a()LVg9;
    .locals 1

    iget-object v0, p0, Llh9;->b:LVg9;

    return-object v0
.end method
