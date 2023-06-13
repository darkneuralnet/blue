.class public final synthetic LBN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh3;


# instance fields
.field public final a:LHK6;


# direct methods
.method public constructor <init>(LHK6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBN6;->a:LHK6;

    return-void
.end method

.method public static a(LHK6;)Lnh3;
    .locals 1

    new-instance v0, LBN6;

    invoke-direct {v0, p0}, LBN6;-><init>(LHK6;)V

    return-object v0
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LBN6;->a:LHK6;

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, LHK6;->a(Ljava/util/List;)V

    return-void
.end method
