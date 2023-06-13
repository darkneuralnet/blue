.class public LAk2$a;
.super LAk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAk2;->a(LAk2$b;LQ70;Ljava/lang/Class;)LAk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LAk2<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LAk2$b;


# direct methods
.method public constructor <init>(LQ70;Ljava/lang/Class;LAk2$b;)V
    .locals 0

    iput-object p3, p0, LAk2$a;->c:LAk2$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LAk2;-><init>(LQ70;Ljava/lang/Class;LAk2$a;)V

    return-void
.end method


# virtual methods
.method public d(Lat5;LMq5;)Lbk2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "LMq5;",
            ")",
            "Lbk2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, LAk2$a;->c:LAk2$b;

    invoke-interface {v0, p1, p2}, LAk2$b;->a(Lat5;LMq5;)Lbk2;

    move-result-object p1

    return-object p1
.end method
