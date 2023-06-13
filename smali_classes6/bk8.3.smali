.class public final Lbk8;
.super LvE2;
.source "SourceFile"


# instance fields
.field public final synthetic i:LOk8;


# direct methods
.method public constructor <init>(LOk8;I)V
    .locals 0

    iput-object p1, p0, Lbk8;->i:LOk8;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, LvE2;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lbk8;->i:LOk8;

    invoke-static {v0, p1}, LOk8;->p(LOk8;Ljava/lang/String;)LyP7;

    move-result-object p1

    return-object p1
.end method
