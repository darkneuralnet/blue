.class public final Lcom/stripe/android/link/account/CookieStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/account/CookieStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\u0008\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0008\u001a\u00020\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\u0008\u000cJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\u0008\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u0012J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u0018J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000c\u0010\u001d\u001a\u00020\u000b*\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/link/account/CookieStore;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "store",
        "Lcom/stripe/android/link/account/EncryptedStore;",
        "(Lcom/stripe/android/link/account/EncryptedStore;)V",
        "clear",
        "",
        "getAuthSessionCookie",
        "",
        "getAuthSessionCookie$link_release",
        "getNewUserEmail",
        "getNewUserEmail$link_release",
        "isEmailLoggedOut",
        "",
        "email",
        "isEmailLoggedOut$link_release",
        "logout",
        "logout$link_release",
        "storeLoggedOutEmail",
        "storeLoggedOutEmail$link_release",
        "storeNewUserEmail",
        "storeNewUserEmail$link_release",
        "updateAuthSessionCookie",
        "cookie",
        "updateAuthSessionCookie$link_release",
        "(Ljava/lang/String;)Lkotlin/Unit;",
        "sha256",
        "Companion",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCookieStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieStore.kt\ncom/stripe/android/link/account/CookieStore\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n13579#2,2:103\n*S KotlinDebug\n*F\n+ 1 CookieStore.kt\ncom/stripe/android/link/account/CookieStore\n*L\n24#1:103,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final AUTH_SESSION_COOKIE:Ljava/lang/String; = "auth_session_cookie"

.field public static final Companion:Lcom/stripe/android/link/account/CookieStore$Companion;

.field public static final LOGGED_OUT_EMAIL_HASH:Ljava/lang/String; = "logged_out_email_hash"

.field public static final SIGNED_UP_EMAIL:Ljava/lang/String; = "signed_up_email"

.field private static final allCookies:[Ljava/lang/String;


# instance fields
.field private final store:Lcom/stripe/android/link/account/EncryptedStore;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/link/account/CookieStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/account/CookieStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/account/CookieStore;->Companion:Lcom/stripe/android/link/account/CookieStore$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/account/CookieStore;->$stable:I

    const-string v0, "logged_out_email_hash"

    const-string v1, "signed_up_email"

    const-string v2, "auth_session_cookie"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/account/CookieStore;->allCookies:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/account/EncryptedStore;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/EncryptedStore;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/account/CookieStore;-><init>(Lcom/stripe/android/link/account/EncryptedStore;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/account/EncryptedStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    return-void
.end method

.method public static final synthetic access$getAllCookies$cp()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/account/CookieStore;->allCookies:[Ljava/lang/String;

    return-object v0
.end method

.method private final sha256(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    const-string p1, "getInstance(\"SHA-256\").d\u2026yteArray(Charsets.UTF_8))"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, Lcom/stripe/android/link/account/CookieStore$sha256$1;->INSTANCE:Lcom/stripe/android/link/account/CookieStore$sha256$1;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    invoke-static/range {v2 .. v10}, Lkotlin/collections/ArraysKt;->joinToString$default([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final clear()V
    .locals 5

    sget-object v0, Lcom/stripe/android/link/account/CookieStore;->allCookies:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    invoke-virtual {v4, v3}, Lcom/stripe/android/link/account/EncryptedStore;->delete(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getAuthSessionCookie$link_release()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    const-string v1, "auth_session_cookie"

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/account/EncryptedStore;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getNewUserEmail$link_release()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    const-string v1, "signed_up_email"

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/account/EncryptedStore;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    invoke-virtual {v2, v1}, Lcom/stripe/android/link/account/EncryptedStore;->delete(Ljava/lang/String;)V

    return-object v0
.end method

.method public final isEmailLoggedOut$link_release(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    const-string v1, "logged_out_email_hash"

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/account/EncryptedStore;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/CookieStore;->sha256(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final logout$link_release(Ljava/lang/String;)V
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/account/CookieStore;->storeLoggedOutEmail$link_release(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    const-string v0, "auth_session_cookie"

    invoke-virtual {p1, v0}, Lcom/stripe/android/link/account/EncryptedStore;->delete(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    const-string v0, "signed_up_email"

    invoke-virtual {p1, v0}, Lcom/stripe/android/link/account/EncryptedStore;->delete(Ljava/lang/String;)V

    return-void
.end method

.method public final storeLoggedOutEmail$link_release(Ljava/lang/String;)V
    .locals 2

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    const-string v1, "logged_out_email_hash"

    invoke-direct {p0, p1}, Lcom/stripe/android/link/account/CookieStore;->sha256(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/account/EncryptedStore;->write(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final storeNewUserEmail$link_release(Ljava/lang/String;)V
    .locals 2

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    const-string v1, "signed_up_email"

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/account/EncryptedStore;->write(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final updateAuthSessionCookie$link_release(Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "auth_session_cookie"

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    invoke-virtual {p1, v1}, Lcom/stripe/android/link/account/EncryptedStore;->delete(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/link/account/CookieStore;->store:Lcom/stripe/android/link/account/EncryptedStore;

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/account/EncryptedStore;->write(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1
.end method
