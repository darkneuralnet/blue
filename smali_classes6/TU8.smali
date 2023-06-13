.class public abstract LTU8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLW8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)LAW8;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final b([B)LAW8;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, LTU8;->c([BII)LAW8;

    move-result-object p1

    return-object p1
.end method

.method public c([BII)LAW8;
    .locals 1

    array-length p2, p1

    const/4 v0, 0x0

    invoke-static {v0, p3, p2}, LyK8;->h(III)V

    invoke-virtual {p0, p3}, LTU8;->d(I)LWW8;

    move-result-object p2

    invoke-interface {p2, p1, v0, p3}, LWW8;->a([BII)LWW8;

    invoke-interface {p2}, LWW8;->zzd()LAW8;

    move-result-object p1

    return-object p1
.end method

.method public d(I)LWW8;
    .locals 0

    invoke-interface {p0}, LLW8;->zze()LWW8;

    move-result-object p1

    return-object p1
.end method
