.class public final LMe9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LTe9;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic b(LMe9;)LTe9;
    .locals 0

    iget-object p0, p0, LMe9;->a:LTe9;

    return-object p0
.end method


# virtual methods
.method public final a(LTe9;)LMe9;
    .locals 0

    iput-object p1, p0, LMe9;->a:LTe9;

    return-object p0
.end method

.method public final c()Ljf9;
    .locals 2

    new-instance v0, Ljf9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljf9;-><init>(LMe9;Lbf9;)V

    return-object v0
.end method
